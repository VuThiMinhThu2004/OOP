import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * Thu vu comment Javadoc.
     */
    public void readCustomerList(InputStream inputStream) {
        /*sử dụng câu lệnh try-with-resources để tự động đóng BufferedReaderkhi hoàn tất 
        InputStreamReaderđược sử dụng để giải mã các byte 
        từ các InputStreamký tự thành các ký tự bằng bộ ký tự UTF-8. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,
                StandardCharsets.UTF_8));

        StringBuilder file = new StringBuilder();
        int data = 0;

        while (data != -1) {
            try {
                data = bufferedReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            file.append((char) data);
        }

        file.deleteCharAt(file.length() - 1);

        String string = file.toString();
        String[] lines = string.split("\\r?\\n");

        Customer customer = null;

        for (String line : lines) {
            if (Character.isAlphabetic(line.charAt(0))) {
                customer = getCustomerFromFile(line);
                customerList.add(customer);
            } else {
                Account account = getAccountForCustomer(line);
                assert customer != null;
                customer.addAccount(account);
            }
        }

    }

    /**
     * Thu vu comment Javadoc.
     */
    public Account getAccountForCustomer(String line) {
        /*loại bỏ các khoảng trắng ở đầu và cuối dòng đầu vào. */
        line = line.trim();
        String[] words = line.split("\\s+");
        long accountNumber = Long.parseLong(words[0]);
        String accountType = words[1];
        double balance = Double.parseDouble(words[2]);
        return accountType.equals(Account.CHECKING)
                ? new CheckingAccount(accountNumber, balance)
                : new SavingsAccount(accountNumber, balance);
    }

    /**
     * Thu vu comment Javadoc.
     */
    public Customer getCustomerFromFile(String line) {
        line = line.trim();
        String[] words = line.split("\\s+");
        String id = words[words.length - 1];
        String name = line.replace(id, "").trim();
        id = id.trim();
        long cmnd = Long.parseLong(id);
        return new Customer(cmnd, name);
    }

    /**
     * Thu vu comment Javadoc.
     * Luu y de sai o day
     */
    public String getCustomersInfoByNameOrder() {
        Collections.sort(customerList, Comparator.comparing(Customer::getFullName));
        return buildCustomerInfoString();
    }

    /**
     * Thu vu comment Javadoc.
     * kiem tra lai
     */
    public String getCustomersInfoByIdOrder() {
        Collections.sort(customerList, Comparator.comparingLong(Customer::getIdNumber));
        return buildCustomerInfoString();
    }

    private String buildCustomerInfoString() {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < customerList.size(); i++) {
            ans.append(customerList.get(i).getCustomerInfo());
            if (i != customerList.size() - 1) {
                ans.append("\n");
            }
        }
        return ans.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
