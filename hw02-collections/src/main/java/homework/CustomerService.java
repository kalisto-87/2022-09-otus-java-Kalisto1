package homework;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private TreeMap<Customer, String> map = new TreeMap<>(Comparator.comparingLong(Customer::getScores));
    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        var mapEntry = map.firstEntry();
        return CopyEntry(mapEntry);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var mapEntry = map.higherEntry(customer);
        return CopyEntry(mapEntry);
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }

    private Map.Entry<Customer, String> CopyEntry(Map.Entry<Customer, String> entry) {
        if (entry == null) return null;
        return Map.entry(
                new Customer(entry.getKey().getId(), entry.getKey().getName(), entry.getKey().getScores()),
                entry.getValue()
        );
    }
}
