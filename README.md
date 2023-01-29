[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9883851)
# Створення класів


## Завдання 1. Створення класу з атрибутами

Створено **в пакеті ````domain````** клас ```` Сustomer ```` з такими **приватними атрибутами**:

    * ````ID```` (номер клієнта, **ціле** число)
    * ````isNew```` (статус клієнта новий він чи старий, **булевське** значення)
    * ````total```` (сума замовлень за рік, **дробове** число)

Атрибути мають **значення за замовчуванням**: 
```java
public Customer() {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;
  }
  ```


## Завдання 2. Додавання в клас методів 

Додав до класу метод ````displayCustomerInfo````, який виводить на консоль інформацію про клієнта з допомогою ````System.out.println````.

```java
public void displayCustomerInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
 ```


## Перевірка працездатності створеного класу

Створив в **пакеті ````test````** клас ````CustomerTest````, в методі ````main```` якого створив об'єкт класу ```` Сustomer ```` та виввіви на екран його властивості з допомогою методу ````displayCustomerInfo````

![](https://github.com/ppc-ntu-khpi/java-1-Zheka2025/blob/main/Solution/done.png?raw=true)

-----
Змінив код та додав:

  **конструктор за замовчуванням**
  
  **методи для зміни атрибутів** - ````setID````, ````setStatus````, ````setTotal````
  
  ```java
  public void setID(int ID) {
    this.ID = ID;
  }

  public void setIsNew(boolean isNew) {
    this.isNew = isNew;
  }

  public void setTotal(double total) {
    if (total >= 0) {
      this.total = total;
    }
 ```
    
  **використання цих методів** в методі ````main```` класу````CustomerTest````
  
  ![](https://github.com/ppc-ntu-khpi/java-1-Zheka2025/blob/main/Solution/advanced.png?raw=true)



