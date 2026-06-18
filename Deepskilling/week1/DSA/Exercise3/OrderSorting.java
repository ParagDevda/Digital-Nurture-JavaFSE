package Deepskilling.week1.DSA.Exercise3;

class Order {

    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return orderId + " " + customerName + " ₹" + totalPrice;
    }
}

public class OrderSorting {

    // Display Orders
    public static void display(Order arr[]) {

        for (Order order : arr) {
            System.out.println(order);
        }

        System.out.println();
    }

    // Bubble Sort
    public static void bubbleSort(Order arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].totalPrice > arr[j + 1].totalPrice) {

                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Partition function for Quick Sort
    public static int partition(Order arr[], int low, int high) {

        double pivot = arr[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].totalPrice <= pivot) {

                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort
    public static void quickSort(Order arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);

            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        Order orders1[] = {
                new Order(101, "Rahul", 5000),
                new Order(102, "Aman", 2000),
                new Order(103, "Rohit", 8000),
                new Order(104, "Priya", 3000)
        };

        System.out.println("Original Orders:");
        display(orders1);

        bubbleSort(orders1);

        System.out.println("After Bubble Sort:");
        display(orders1);

        Order orders2[] = {
                new Order(101, "Rahul", 5000),
                new Order(102, "Aman", 2000),
                new Order(103, "Rohit", 8000),
                new Order(104, "Priya", 3000)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("After Quick Sort:");
        display(orders2);
    }
}
