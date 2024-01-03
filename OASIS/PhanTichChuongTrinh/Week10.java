import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {
    private final List<String> classList = new ArrayList<>();
    private final List<String> libNameList = new ArrayList<>();
    private final List<String> libPathList = new ArrayList<>();
    private String packageFullName = null;

    /**
     * Thu Vu comment Javadoc.
     */
    public String[] formatContent(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }

        Pattern openParenthesisPattern = Pattern.compile("\\($");

        for (int i = 0; i < lines.length - 1; i++) {
            Matcher matcher = openParenthesisPattern.matcher(lines[i]);
            if (matcher.find()) {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }

        Pattern singleLineCommentPattern = Pattern.compile("^//.*");
        Pattern multiLineCommentStartPattern = Pattern.compile("^/\\*.*");
        Pattern multiLineCommentEndPattern = Pattern.compile(".*\\*/$");

        for (int i = 0; i < lines.length; i++) {
            Matcher singleLineMatcher = singleLineCommentPattern.matcher(lines[i]);
            Matcher multiLineStartMatcher = multiLineCommentStartPattern.matcher(lines[i]);
            if (singleLineMatcher.matches() || multiLineStartMatcher.matches()) {
                lines[i] = "";
            }

            if (multiLineStartMatcher.matches()) {
                int j = i;
                while (j < lines.length 
                && !multiLineCommentEndPattern.matcher(lines[j]).matches()) {
                    lines[j] = "";
                    j++;
                }
                lines[j] = "";
            }
        }

        return lines;
    }

    /**
     * Thu Vu comment Javadoc.
     */
    public void getPackageInfo(String[] lines) {
        classList.clear();
        boolean foundPackage = false;

        for (String s : lines) {
            String[] line = s.split(" ");

            // Tìm và lưu thông tin về gói package: sử dụng biểu thức chính quy
            if (!foundPackage && line.length > 1 && line[0].equals("package")) {
                packageFullName = line[1].replaceAll(";$", "");
                foundPackage = true;
            }

            // Tìm và lưu thông tin về lớp (class và interface)
            if (line.length >= 3) {
                String modifier = line[0];
                String type = line[1];
                String name = line[2];

                if ((modifier.equals("public") || modifier.equals("protected")
                        || modifier.equals("private")) 
                       && (type.equals("class") || type.equals("interface"))) {
                    classList.add(name);
                }
            }
        }

        // test
        // if (classList.isEmpty()) {
        // System.out.println("classList is Empty");
        // } else {
        // // In ra danh sách các lớp và giao diện
        // System.out.println("List of classes/interfaces:");
        // for (String className : classList) {
        // System.out.println(className);
        // }
        // }
    }

    /**
     * Thu Vu comment Javadoc.
     */
    public void getImportFilesInfo(String[] lines) {
        libNameList.clear();
        libPathList.clear();

        for (String line : lines) {
            String[] tokens = line.split("\\s+"); // Tách dòng thành các token dựa trên khoảng trắng

            if (tokens.length >= 2 && tokens[0].equals("import")) {
                int pos = (tokens[1].equals("static")) ? 2 : 1; 

                String path = tokens[pos].replaceAll(";$", ""); 

                int dotIndex = path.lastIndexOf('.'); // Tìm vị trí của dấu chấm cuối cùng
                String name = (dotIndex != -1) ? path.substring(dotIndex + 1) : path; 

                libPathList.add(path); // Thêm đường dẫn vào danh sách
                libNameList.add(name); // Thêm tên thư viện vào danh sách
            }
        }

        // test
        // if (libNameList.isEmpty()) {
        // System.out.println("libNameList is Empty");
        // } else {
        // System.out.println("List of libName:");
        // for (String libraryName : libNameList) {
        // System.out.println(libraryName);
        // }
        // }

        // if (libPathList.isEmpty()) {
        // System.out.println("libNameList is Empty");
        // } else {
        // System.out.println("List of libName:");
        // for (String libPath : libPathList) {
        // System.out.println(libPath);
        // }
        // }
    }

    /**
     * Thu Vu comment Javadoc.
     */
    private int validateLine(String[] line) {
        if (line.length < 4) {
            return -1;
        }

        String lastToken = line[line.length - 1];
        if (lastToken.isEmpty() || lastToken.endsWith(";")) {
            return -1;
        }

        // Check for valid access modifier (public, protected, private)
        if (!(line[0].equals("static") || line[0].equals("public") 
            || line[0].equals("protected") || line[0].equals("private"))) {
            return -1;
        }

        // Check for static keyword if present
        if (!line[0].equals("static") && !line[1].equals("static")) {
            return -1;
        }

        // Find the position of the opening parenthesis "("
        int p = 0;
        while (p < line.length && !line[p].contains("(")) {
            p++;
        }

        return (p < line.length ? p : -1);
    }

    /**
     * Thu Vu comment Javadoc.
     */
    public String getParameter(String str) {
        String pattern = "<([^<>]+)>|([^<>.]+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(str);

        StringBuilder result = new StringBuilder();
        String childTmp = null;

        while (matcher.find()) {
            String group = matcher.group();
            if (group.startsWith("<")) {
                childTmp = getParameter(group.substring(1, group.length() - 1));
            } else {
                String temp = group;
                String res = null;

                for (int i = 0; i < libNameList.size(); i++) {
                    if (temp.equals(libNameList.get(i))) {
                        res = libPathList.get(i);
                        break;
                    }
                }

                if (res == null) {
                    for (String className : classList) {
                        if (className.equals(temp)) {
                            res = packageFullName + '.' + temp;
                            break;
                        }
                    }
                }

                if (res == null && temp.length() > 0 && Character.isUpperCase(temp.charAt(0))
                        && !temp.equals("T[]") && !temp.equals("T")) {
                    res = "java.lang." + temp;
                }

                if (res == null) {
                    res = temp;
                }

                result.append(res);
            }
        }

        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '{') {
                break;
            }
            finalResult.append(result.charAt(i));
        }

        if (childTmp != null) {
            finalResult.append("<").append(childTmp).append(">");
        }

        return finalResult.toString();
    }

    /**
     * Thu Vu comment Javadoc.
     */
    private String getFunctionName(String line) {
        StringBuilder res = new StringBuilder();
        int index = line.indexOf('(');
        if (index != -1) {
            res.append(line, 0, index + 1); // Copy phần từ đầu đến dấu '(' vào res
            String params = getParameter(line.substring(index + 1)); // Lấy các tham số của hàm
            res.append(params); // Thêm các tham số vào res
        } else {
            res.append(line); // Trả lại toàn bộ chuỗi nếu không có dấu '('
        }
        return res.toString();
    }

    /**
     * Thu Vu comment Javadoc.
     */
    public List<String> getAllFunctions(String fileContent) {
        List<String> results = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        lines = formatContent(lines);
        getPackageInfo(lines);
        getImportFilesInfo(lines);

        for (String s : lines) {
            String[] line = s.split(" ");
            int pos = validateLine(line);
            if (pos != -1) {
                StringBuilder rs = new StringBuilder(getFunctionName(line[pos]));
                if (!line[pos].contains(")")) {
                    for (int j = pos + 2; j < line.length - 1; j += 2) {
                        if (line[j - 1].contains(")")) {
                            break;
                        }
                        rs.append(",").append(getParameter(line[j]));
                        if (line[j].contains(")")) {
                            break;
                        }
                    }
                    rs.append(")");
                }
                results.add(rs.toString());
            }
        }
        return results;
    }

    /**
     * Thu Vu comment Javadoc.
     */
    public void testcase(String fileContent) {
        List<String> results = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        lines = formatContent(lines);
        System.out.println(lines);
        getPackageInfo(lines);
        getImportFilesInfo(lines);

        for (String s : lines) {
            String[] line = s.split(" ");
            int pos = validateLine(line);
            System.out.println("pos: " + pos);
            if (pos != -1) {
                StringBuilder rs = new StringBuilder(getFunctionName(line[pos]));
                if (!line[pos].contains(")")) {
                    for (int j = pos + 2; j < line.length - 1; j += 2) {
                        if (line[j - 1].contains(")")) {
                            break;
                        }
                        rs.append(",").append(getParameter(line[j]));
                        if (line[j].contains(")")) {
                            break;
                        }
                    }
                    rs.append(")");
                }
                results.add(rs.toString());
            }
        }
    }
}