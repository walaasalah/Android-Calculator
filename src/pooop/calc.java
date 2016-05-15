package pooop;

	import javafx.geometry.Pos;


	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.control.Button;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.Scene;
	import javafx.scene.layout.FlowPane;
	import javafx.scene.layout.GridPane;
    import javafx.scene.layout.Pane;
    import javafx.scene.paint.Color;
    import javafx.scene.text.Font;
    import javafx.scene.text.FontPosture;
    import javafx.scene.text.FontWeight;
	import javafx.stage.Stage;

	public class calc extends Application {
	
		TextField text = new TextField();
		double number1;
	    double number2;
	    String operation;

		 @Override
 public void start(Stage primaryStage) {
		
	// Pane pane = new Pane();
 GridPane p=new GridPane();		     
p.setAlignment(Pos.CENTER);	 
 text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
 p.setPadding(new Insets (5, 5, 5, 5));	    
 p.setHgap(5);    
p.setVgap(5);
text.setEditable(false);
text.setAlignment(Pos.CENTER_LEFT);
text.setMinSize(400, 50);
p.setStyle("-fx-color: red;-fx-background:black");


	Button b1 = new Button("7");        
	 b1.setMinSize(40, 40);
		
	b1.setOnAction(e->{String value=((Button)e.getSource()).getText();
	text.setText(text.getText()+value);
	});

		 
	 
	Button b2 = new Button("8");
	 b2.setMinSize(40, 40);
	 b2.setOnAction(e->{String value=((Button)e.getSource()).getText();
	 text.setText(text.getText()+value);
	 });
	

	 Button b3 = new Button("9");
	  b3.setMinSize(40, 40);
	  b3.setOnAction(e->{String value=((Button)e.getSource()).getText();
	  text.setText(text.getText()+value);
	  });
	  
	  
	 Button b4= new Button("%"); 
	 b4.setMinSize(40, 40);
	 b4.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
	 operation="%";
	 });
	 
	 
	 Button b5= new Button("DEL"); 
	b5.setMinSize(40, 40);
	b5.setOnAction(e->{String value= text.getText();

	if(Character.isDigit(value.charAt(value.length()-1)))
		text.setText(value.substring(0, value.length()-1));

	else
		  text.setText(value.substring(0, value.length()-3)); });

	Button b6= new Button("AC");
	b6.setMinSize(40, 40);
	b6.setOnAction(e->{
		text.setText("");
		});
	
	
	
	Button b24=new Button("×^3");
	b24.setMinSize(40, 40);
	 b24.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		text.setText("");
		operation="×^3";});
	 
	 
	 Button b25=new Button("sin");
	b25.setMinSize(40, 40);
	 b25.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		text.setText("");
		operation="sin";});
	 
	 Button b26=new Button("sinh");
	 b26.setMinSize(40, 40);
	 b26.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		text.setText("");
		operation="sinh";});
	 
			  		    
	  Button b7 = new Button("4");
	 b7.setMinSize(40, 40);
	 b7.setOnAction(e->{String value=((Button)e.getSource()).getText();
	text.setText(text.getText()+value);
	});
	 
	 
	 Button b8 = new Button("5");
	 b8.setMinSize(40, 40);
	 b8.setOnAction(e->{String value=((Button)e.getSource()).getText();
	 text.setText(text.getText()+value);
	 });
	 
	 
	 Button b9 = new Button("6");
	 b9.setMinSize(40, 40);
	b9.setOnAction(e->{String value=((Button)e.getSource()).getText();
	text.setText(text.getText()+value);
	});
	 
	 
	Button b10 = new Button("×");
	b10.setMinSize(40, 40);
	b10.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	text.setText("");
	operation="*";});

	
	Button b11 = new Button("(");
	b11.setMinSize(40, 40);
	b11.setOnAction(e->{String value=((Button)e.getSource()).getText();
	text.setText(text.getText()+value);
	});
	
	
	 Button b12 = new Button(")");
	 b12.setMinSize(40, 40);
	 b12.setOnAction(e->{String value=((Button)e.getSource()).getText();
			text.setText(text.getText()+value);
	});
	 
	 
	 Button b27=new Button("×^y");
	 b27.setMinSize(40, 40);
	 b27.setOnAction(e->{});
	 b27.setMinSize(40, 40);
		b27.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		 text.setText("");
		 operation="×^y";});
		
		
	Button b28=new Button("cos");
	b28.setMinSize(40, 40);
	b28.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
	 operation="cos";});
	 	
	Button b29=new Button("cosh");
	b29.setMinSize(40, 40);
	b29.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
  operation="cosh";});
	 	
			  
	Button b13 = new Button("1");
	b13.setMinSize(40, 40);
	b13.setOnAction(e->{String value=((Button)e.getSource()).getText();
		text.setText(text.getText()+value);
	});      

	
	Button b14 = new Button("2");
	 b14.setMinSize(40, 40);
	 b14.setOnAction(e->{String value=((Button)e.getSource()).getText();
		text.setText(text.getText()+value);
	 });
	
	 
	 Button b15 = new Button("3");
	 b15.setMinSize(40, 40);
	 b15.setOnAction(e->{String value=((Button)e.getSource()).getText();
		text.setText(text.getText()+value);
	 });
	 
	 
	 Button b16 = new Button("-");
	 b16.setMinSize(40, 40);
	 b16.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
	 operation="-";});
	 
	 Button b17 = new Button("x^2");
	b17.setMinSize(40, 40);
	b17.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	text.setText("");
	operation="x^2";});

	 Button b18 = new Button("sqrt");
	 b18.setMinSize(40, 40);
	 
		 b18.setOnAction(e->{number1 = Double.parseDouble(text.getText());
			text.setText("");
			operation="sqrt";
	});
	 
		 Button b30=new Button("x^10");
		 b30.setMinSize(40, 40);
			b30.setOnAction(e->{number1 = Double.parseDouble(text.getText());
			 text.setText("");
			 operation="x^10";});
			
			Button b31=new Button("tan");
			b31.setMinSize(40, 40);
			b31.setOnAction(e->{number1 = Double.parseDouble(text.getText());
			 text.setText("");
			 operation="tan";});
			
			Button b40=new Button("tanh");
			b40.setMinSize(40, 40);
			b40.setOnAction(e->{number1 = Double.parseDouble(text.getText());
			 text.setText("");
			 operation="tanh";});
	
			       
	 Button b19 = new Button("0");
	 b19.setMinSize(40, 40);
	 b19.setOnAction(e->{String value=((Button)e.getSource()).getText();
		text.setText(text.getText()+value);
	});
	 
	 
	 Button b20 = new Button(".");
	b20.setMinSize(40, 40);
	b20.setOnAction(e->{String value=((Button)e.getSource()).getText();
		text.setText(text.getText()+value);
	});
	
	
	Button b21 = new Button("/");
	 b21.setMinSize(40, 40);
	 b21.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
	 operation="/";});
	
	 
	 Button b22 = new Button ("+");
	 b22.setMinSize(40, 40);
	 b22.setOnAction(e->{number1 = Double.parseDouble(text.getText());
	 text.setText("");
	 operation="+";
	 });

	 
	 Button b32=new Button("1/×");
	 b32.setMinSize(40, 40);
		b32.setOnAction(e->{ number1 = Double.parseDouble(text.getText());
		 text.setText("");
		 operation="1/x";});
	 
		
		Button b33=new Button("log");
		b33.setMinSize(40, 40);
		b33.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		 text.setText("");
		 operation="log";});
		
		
		Button b34=new Button("e^x");
		b34.setMinSize(40, 40);
		b34.setOnAction(e->{number1 = Double.parseDouble(text.getText());
		 text.setText("");
		 operation="e^x";});
		
		
	 Button b23 = new Button("=");
	 b23.setMinSize(40, 40);
	b23.setOnAction( e->{
		
if(operation=="+"||operation=="-"||operation=="/"||operation=="*"||operation=="×^y")
	{equal1();
	}else{
		equal2();}
	
});

	//add by row
	 p.add(text, 1,1,9,1);
	 
     p.add(b1, 1, 2);
     p.add(b2, 2, 2);
     p.add(b3, 3, 2);
     p.add(b4, 4, 2);
     p.add(b5, 5, 2);
     p.add(b6, 6, 2);
     p.add(b24, 7, 2);
     p.add(b25, 8, 2);
     p.add(b26, 9, 2);
     
     p.add(b7, 1, 3);
     p.add(b8, 2, 3);
     p.add(b9, 3, 3);
     p.add(b10, 4, 3);
     p.add(b11, 5, 3);
     p.add(b12, 6, 3);
     p.add(b27, 7, 3);
     p.add(b28, 8, 3);
     p.add(b29, 9, 3);
     
     p.add(b13, 1, 4);
     p.add(b14, 2, 4);
     p.add(b15, 3, 4);
     p.add(b16, 4, 4);
     p.add(b17, 5, 4);
     p.add(b18, 6, 4);
     p.add(b30, 7, 4);
     p.add(b31, 8, 4);
     p.add(b32, 9, 4);
     
     p.add(b19, 1, 5);
     p.add(b20, 2, 5);
     p.add(b21, 3, 5);
     p.add(b22, 4, 5);
     p.add(b33, 5, 5);
     p.add(b34, 6, 5);
     p.add(b23, 7, 5, 3,1);
     
     
     text.prefWidthProperty().bind(p.widthProperty().divide(1));
     text.prefHeightProperty().bind(p.heightProperty().divide(2));
     
     b1.prefWidthProperty().bind(p.widthProperty().divide(3));
     b2.prefWidthProperty().bind(p.widthProperty().divide(3));
     b3.prefWidthProperty().bind(p.widthProperty().divide(3));
     b4.prefWidthProperty().bind(p.widthProperty().divide(3));
     b5.prefWidthProperty().bind(p.widthProperty().divide(3));
     b6.prefWidthProperty().bind(p.widthProperty().divide(3));
     b7.prefWidthProperty().bind(p.widthProperty().divide(3));
     b8.prefWidthProperty().bind(p.widthProperty().divide(3));
     b9.prefWidthProperty().bind(p.widthProperty().divide(3));
     b10.prefWidthProperty().bind(p.widthProperty().divide(3));
     
     b11.prefWidthProperty().bind(p.widthProperty().divide(3));
     b12.prefWidthProperty().bind(p.widthProperty().divide(3));
     b13.prefWidthProperty().bind(p.widthProperty().divide(3));
     b14.prefWidthProperty().bind(p.widthProperty().divide(3));
     b15.prefWidthProperty().bind(p.widthProperty().divide(3));
     b16.prefWidthProperty().bind(p.widthProperty().divide(3));
     b17.prefWidthProperty().bind(p.widthProperty().divide(3));
     b18.prefWidthProperty().bind(p.widthProperty().divide(3));
     b19.prefWidthProperty().bind(p.widthProperty().divide(3));
     b20.prefWidthProperty().bind(p.widthProperty().divide(3));
     
     b21.prefWidthProperty().bind(p.widthProperty().divide(3));
     b22.prefWidthProperty().bind(p.widthProperty().divide(3));
     b23.prefWidthProperty().bind(p.widthProperty().divide(3));
     b24.prefWidthProperty().bind(p.widthProperty().divide(3));
     b25.prefWidthProperty().bind(p.widthProperty().divide(3));
     b26.prefWidthProperty().bind(p.widthProperty().divide(3));
     b27.prefWidthProperty().bind(p.widthProperty().divide(3));
     b28.prefWidthProperty().bind(p.widthProperty().divide(3));
     b29.prefWidthProperty().bind(p.widthProperty().divide(3));
     b30.prefWidthProperty().bind(p.widthProperty().divide(3));
     
     b31.prefWidthProperty().bind(p.widthProperty().divide(3));
     b32.prefWidthProperty().bind(p.widthProperty().divide(3));
     b33.prefWidthProperty().bind(p.widthProperty().divide(3));
     b34.prefWidthProperty().bind(p.widthProperty().divide(3));
     
     
     b1.prefHeightProperty().bind(p.heightProperty().divide(3));
     b2.prefHeightProperty().bind(p.heightProperty().divide(3));
     b3.prefHeightProperty().bind(p.heightProperty().divide(3));
     b4.prefHeightProperty().bind(p.heightProperty().divide(3));
     b5.prefHeightProperty().bind(p.heightProperty().divide(3));
     b6.prefHeightProperty().bind(p.heightProperty().divide(3));
     b7.prefHeightProperty().bind(p.heightProperty().divide(3));
     b8.prefHeightProperty().bind(p.heightProperty().divide(3));
     b9.prefHeightProperty().bind(p.heightProperty().divide(3));
     b10.prefHeightProperty().bind(p.heightProperty().divide(3));
     
     b11.prefHeightProperty().bind(p.heightProperty().divide(3));
     b12.prefHeightProperty().bind(p.heightProperty().divide(3));
     b13.prefHeightProperty().bind(p.heightProperty().divide(3));
     b14.prefHeightProperty().bind(p.heightProperty().divide(3));
     b15.prefHeightProperty().bind(p.heightProperty().divide(3));
     b16.prefHeightProperty().bind(p.heightProperty().divide(3));
     b17.prefHeightProperty().bind(p.heightProperty().divide(3));
     b18.prefHeightProperty().bind(p.heightProperty().divide(3));
     b19.prefHeightProperty().bind(p.heightProperty().divide(3));
     b20.prefHeightProperty().bind(p.heightProperty().divide(3));
     
     b21.prefHeightProperty().bind(p.heightProperty().divide(3));
     b22.prefHeightProperty().bind(p.heightProperty().divide(3));
     b23.prefHeightProperty().bind(p.heightProperty().divide(3));
     b24.prefHeightProperty().bind(p.heightProperty().divide(3));
     b25.prefHeightProperty().bind(p.heightProperty().divide(3));
     b26.prefHeightProperty().bind(p.heightProperty().divide(3));
     b27.prefHeightProperty().bind(p.heightProperty().divide(3));
     b28.prefHeightProperty().bind(p.heightProperty().divide(3));
     b29.prefHeightProperty().bind(p.heightProperty().divide(3));
     b30.prefHeightProperty().bind(p.heightProperty().divide(3));
     
     b31.prefHeightProperty().bind(p.heightProperty().divide(3));
     b32.prefHeightProperty().bind(p.heightProperty().divide(3));
     b33.prefHeightProperty().bind(p.heightProperty().divide(3));
     b34.prefHeightProperty().bind(p.heightProperty().divide(3));

	 Scene scene = new Scene(p,450,260);	 
	 primaryStage.setTitle("Calculator");
	 primaryStage.setScene(scene);
	 primaryStage.show();

			    }
		 
		 void equal1(){
			 
		String value;
		
		number2 = Double.parseDouble(text.getText());
		double result = 0;
	if(operation == "/" && number2==0)
        text.setText("Cannot divide by zero");
	else
	{
		
		switch(operation){
		  case "+":
	            result = number1 + number2;
	            break;
	        case "-":
	            result = number1 - number2;
	            break;
	        case "*":
	            result = number1 * number2;
	            break;
	        case "/":
	                result = number1 / number2;
	            break;
	        case"×^y":
	        	result=Math.pow(number1, number2);
	        	break;
	    }
	value= Double.toString(result);
	text.setText(value);
	}
		 }
		void equal2(){
		
			String value;
			
			double result = 0;
	
		if(operation == "1/×" && number1 == 0)
			 text.setText("Error");
			 else
			 {
	
			switch(operation)
		    {
		   
		        case "x^2":
		             result = number1 * number1;
		            break;
		        case "sqrt":
		            result = Math.sqrt( number1 );
		            break;
		        case "%": 
		        	
		             result =  (number1 / 100)*100 ;
		            break;
		    
		        case "1/x":
		        	result = 1.0 / number1;
		        	break;
		        	
		        case "log":
		        	result=Math.log10(number1);
		        	break;
		        case"cos":
		        	result=Math.cos(Math.toRadians(number1));
		    
		    break;
		        case "cosh":
		        	result=Math.cosh(number1);
		        	break;
		        	
		        case"sin":
		        	result=Math.sin(Math.toRadians(number1));
		        	break;
		        case "sinh":
		        	result=Math.sinh(number1);
		        	break;
		        case "tan":
		        	result=Math.tan(Math.toRadians(number1));
		        	break;
		        case "tanh":
		        	result=Math.tanh(number1);
		        	break;
		        case "×^3":
		        	result=Math.pow(number1, 3);
		        	break;
		        case "x^10":
		        	result=Math.pow(number1,10);
		        	break;
		        case "e^x":
		        	result=Math.exp(number1);
		        	break;
		        	
		    }	
		    
			value= Double.toString(result);
			text.setText(value);
			 }
	}

	
		
	 public static void main (String[] args) {
	 Application.launch(args);  

		}
	}