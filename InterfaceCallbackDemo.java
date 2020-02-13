package com.example.selfprogrammingtest.DesignPattern;
//create an interface for callback method
interface OnClickListener {
    void onClick();
}
//create callback handler and implement above interface
class ClickListener implements OnClickListener {

    @Override
    public void onClick() {
        System.out.println(" simply clicked");

    }


}
//create event generator class
class Button {
    void onButtonClick(OnClickListener onClickListener) {
        onClickListener.onClick();
        System.out.println("hi");
    }
}

public class InterfaceCallbackDemo {
    public static void main(String[] args) {
        Button button = new Button();
        ClickListener clickListener = new ClickListener();
        //pass the clickListener to default operation
        button.onButtonClick(clickListener);
        System.out.println("hello");
        Button button1 = new Button();
        //pass interface to implement own operation
        button1.onButtonClick(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked");
            }
        });
    }
}
