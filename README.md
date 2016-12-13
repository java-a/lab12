# lab12

> 1. Explore custom exception class
> 2. Explore JavaFX and GUI

## Problem 0：Lucky Number Calculator (Don't have to write code) 

In this lab, we will complete a `Lucky Number Calculator` which can tell you what are your lucky numbers☘️. You do not need to write any code here. And the complete project is included in the github for reference.

Below is the application expected. And because you have not learned `Exception` in class, so TA gives the complete code. We hope you can learn exception part by yourself.

![Screen Shot 2016-12-12 at 8.38.36 PM](https://cloud.githubusercontent.com/assets/9759891/21099947/1e0bc8d6-c0ac-11e6-9d20-5e643adf3bac.png)

### Step 1: Define the exceptions

There can be some input exceptions, for example, illegal characters in the name or illegal input date.

So we create a class `FormatException ` to deal with these illegal inputs. We use `NameFormatException` to indicate illegal characters, and `NumberFormatException` to indicate illegal date.

For a exception class defined by yourself, it has to be extended from `Exception`

```java
public class FormatException extends Exception {
    // indicate error information.
    private String message;

    public FormatException() {
        this.message = "Format error.";
    }

 	@Override
    public String getMessage() {
        return this.message;
    }
}
```

And we can define a more detailed exception class. Below is an exemple. You may notice that the very specific error information is included in the `getMessage()` method.

```java
public class NameFormatException extends FormatException {
    private String value;
    private int index;

    public NameFormatException(String value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public String getMessage() {
        return "The char: " + value + "[" + index + "] is illegal.";
    }
}
```

### Step 2: Complete the controller logic

We use a `Controller` to impletement the calculation and validation.

The calculation is based on [How to Find Your Lucky Numbers in Numerology](http://www.wikihow.com/Find-Your-Lucky-Numbers-in-Numerology).

And the `Controller` is used by the `eventHandler` of a GUI.

### Step 3: Explore simple GUI

> Reference [this website](http://www.prokerala.com/numerology/lucky-numbers.php) to calculate your lucky number >_<

There are 3 basic components in this application: **Label**, **TextField**, and **Button**. And you can choose a specific **Pane** in your application, we use `GridPane` as an example.

#### Lable

We can directly define the label text when creating a Label object. You can also use `setText()` to set the text.

```java
Label label = new Label("label text");
label.setText("new text");
```

#### TextField

We can create the object directly and set some indication text in the input field by `setPromptText()`.

```java
TextField textFirstName = new TextField();
textFirstName.setPromptText("Enter your first name");
```

#### Button

We can set the content showed on the button by `setText()`. And you should write code in the default `EventHandler` to handle the click event.

```java
Button btnCalculate = new Button();
btnCalculate.setText("Show My Lucky Number!");

btnCalculate.setOnAction(new EventHandler<ActionEvent>() {

    @Override
    public void handle(ActionEvent event) {
        // Write some code here to handle the click event.
    }
});
```

#### GridPane

We can use a grid layout in the pane by creating a `GridPane`. And all the components should be placed on a pane (Of course you can choose other kind of pane).

`setPadding()` allows us to define the padding around the pane.

`setHgap()` and `setVgap()` are used to specify the gap between rows and columns.

`setConstraints(node, col, row)` is used to place a defined node in a specific row and column.

And make sure you have `add()` your button, label and other nodes in your pane.

```java
GridPane pane = new GridPane();
pane.setPadding(new Insets(10, 10, 10, 10));
pane.setHgap(5);
pane.setVgap(5);

pane.setConstraints(labelFirstName, 0, 0);
pane.getChildren().add(labelFirstName);
```



## Problem 1: Heron and Triangle 

We need to complete a similar GUI in problem 2. Here we should judge whether 3 numbers can construct a triangle and calculate the area of this triangle.

Below is a simple GUI for your reference.

![img](https://cloud.githubusercontent.com/assets/9759891/21104170/805609f2-c0c0-11e6-88e0-028586e3423e.png)

We can use Heron's formula to calculate the area.

![img](https://cloud.githubusercontent.com/assets/9759891/21104269/d8649dac-c0c0-11e6-9830-fb6633c282a1.png)

where **s = (a + b + c) * 0.5**.

You should also show the information when the edges cannot construct a triangle.

# Easter egg

After you finish this lab, come to TAs for the Google Cardboard! Have fun! :)
![image](https://cloud.githubusercontent.com/assets/7262715/21125027/7d2c19c6-c11d-11e6-95fb-c0005f0c8b23.png)


## Submission

**Deadline:** Tuesday, 2016.12.13 23:59:59 (UTC+8)

Upload your work to:

```
ftp://10.132.141.33/classes/16/161 程序设计A （戴开宇）/WORK_UPLOAD/lab12
```
