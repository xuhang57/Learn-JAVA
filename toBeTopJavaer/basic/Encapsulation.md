# Encapsulation

## Definition

* Wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.
* A protective shield that prevents the data from being accessed by the code outside this shield.

## Details

* Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared
* As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding
* Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

## Examples

the setters and getters in a class.

```java
public class Account {
    // since private, can only be accessed with the methods defined in the class. So data hiding
    private int account_number;
    private int account_balance;

    public void showData() {
        //code to show data
    }

    public void deposit(int a) {
        if (a < 0) {
            // show error
        } else {
            this.account_balance = this.account_balance + a;
        }
    }

    public void setNumber(int num) {
        this.account_number = num;
    }

    public int getBalance() {
        return this.account_balance;
    }
}

}
```

## Advantages

* Data Hiding
* Increased Flexibility
* Reusability
* Test code is easy

## Abstraction vs. Encapsulation

* Encapsulation is more about "How" to achieve a functionality
* Abstraction is more about "What" a class can do.

## Reference

* [GeeksforGeeks](https://www.geeksforgeeks.org/encapsulation-in-java/)
* [Guru99](https://www.guru99.com/java-oops-encapsulation.html)