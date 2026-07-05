package com.matin.calculator.frontend;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.MemoryHandler;

import com.matin.calculator.backend.BigInt;
import com.matin.calculator.backend.CalculationInput;
import com.matin.calculator.backend.ExpressionEvaluator;
import com.matin.calculator.backend.FileManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class StartPage implements Initializable{

	@FXML
	private ProgressBar ProgressPercentage;

	@FXML
	private Button btn0;

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private Button btn4;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btn7;

	@FXML
	private Button btn8;

	@FXML
	private Button btn9;

	@FXML
	private Button btnMemoryAdd;

	@FXML
	private Button btnMemoryClear;

	@FXML
	private Button btnMemoryDivide;

	@FXML
	private Button btnMemoryMultiply;

	@FXML
	private Button btnMemoryRecall;

	@FXML
	private Button btnMemorySubtract;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btnBackspace;

	@FXML
	private Button btnC;

	@FXML
	private Button btnCE;

	@FXML
	private Button btnDivide;

	@FXML
	private Button btnDot;

	@FXML
	private Button btnEquals;

	@FXML
	private Button btnFactorial;

	@FXML
	private Button btnMod;

	@FXML
	private Button btnMultiply;

	@FXML
	private Button btnNegate;

	@FXML
	private Button btnSqrt;

	@FXML
	private Button btnPow;

	@FXML
	private Button btnSubtract;

	@FXML
	private Label lblDisplay;

	@FXML
	private Button btnLoad;

	@FXML
	private Button btnSave;

	private boolean flag; //وقتی علامتی نوشته شود ک زبان کامپیوتر با زبان انسان فرق داشته باشد true میشه

	@FXML
	private Label lblHistory;

	private String History;

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		lblDisplay.setText("0");
		History="";
	}

	@FXML
	void btn0Pressing(ActionEvent event) 
	{
		if (lblDisplay.getText().equals("0"))
			lblDisplay.setText("0");
		else
			lblDisplay.setText(lblDisplay.getText() + "0");
	}

	@FXML
	void btn1Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("1");
		else
			lblDisplay.setText(lblDisplay.getText()+"1");
	}

	@FXML
	void btn2Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("2");
		else
			lblDisplay.setText(lblDisplay.getText()+"2");
	}

	@FXML
	void btn3Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("3");
		else
			lblDisplay.setText(lblDisplay.getText()+"3");
	}

	@FXML
	void btn4Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("4");
		else
			lblDisplay.setText(lblDisplay.getText()+"4");
	}

	@FXML
	void btn5Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("5");
		else
			lblDisplay.setText(lblDisplay.getText()+"5");
	}

	@FXML
	void btn6Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("6");
		else
			lblDisplay.setText(lblDisplay.getText()+"6");
	}

	@FXML
	void btn7Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("7");
		else
			lblDisplay.setText(lblDisplay.getText()+"7");
	}

	@FXML
	void btn8Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("8");
		else
			lblDisplay.setText(lblDisplay.getText()+"8");
	}

	@FXML
	void btn9Pressing(ActionEvent event) 
	{
		if(lblDisplay.getText().equals("0"))
			lblDisplay.setText("9");
		else
			lblDisplay.setText(lblDisplay.getText()+"9");
	}

	@FXML
	void btnAddPressing(ActionEvent event) 
	{
		if(SignFlag()==false)
			lblDisplay.setText(lblDisplay.getText()+"+");
	}

	@FXML
	void btnBackspacePressing(ActionEvent event) 
	{
		String S="";
		for(int x=0; x<lblDisplay.getText().length()-1; x++)
		{
			S+=lblDisplay.getText().charAt(x);
		}
		lblDisplay.setText(S);
		if(lblDisplay.getText().equals(""))
			lblDisplay.setText("0");
	}

	@FXML
	void btnCEPressing(ActionEvent event) 
	{
		if (!lblDisplay.getText().equals("0"))
		{
			int i=-1;
			for(int x=lblDisplay.getText().length()-1; x>=0; x--)
			{
				if(lblDisplay.getText().charAt(x)=='÷' || lblDisplay.getText().charAt(x)=='x'
						|| lblDisplay.getText().charAt(x)=='-' || lblDisplay.getText().charAt(x)=='+')
				{
					i=x;
					break;
				}
			}
			if(i==-1)
				lblDisplay.setText("0");
			else
			{
				lblDisplay.setText(lblDisplay.getText().substring(0, i+1));
			}
		}
	}

	@FXML
	void btnCPressing(ActionEvent event) 
	{
		lblDisplay.setText("0");
	}

	@FXML
	void btnDividePressing(ActionEvent event)
	{
		if(SignFlag()==false)
		{
			flag=true;
			lblDisplay.setText(lblDisplay.getText()+"÷");
		}
	}

	@FXML
	void btnDotPressing(ActionEvent event) 
	{
		//if(SignFlag()==false)
		//lblDisplay.setText(lblDisplay.getText()+".");
	}

	@FXML
	void btnEqualsPressing(ActionEvent event) 
	{
		if(!lblDisplay.getText().equals("0"))
		{
			if(!SignFlag())
			{
				CalculationInput Pojo= new CalculationInput();
				if(flag)
				{
					String Input="";
					for(int x=0; x<lblDisplay.getText().length(); x++)
					{
						if(lblDisplay.getText().charAt(x)=='÷')
						{
							Input+="/";
						}
						else if(lblDisplay.getText().charAt(x)=='x')
						{
							Input+="*";
						}
						else
							Input+=lblDisplay.getText().charAt(x);
					}
					Pojo.SetInput(Input);
				}
				else
				{
					Pojo.SetInput(lblDisplay.getText());
				}
				ExpressionEvaluator SendInput= new ExpressionEvaluator(Pojo);

				History+=lblDisplay.getText()+"="+ Pojo.GetOutput()+ "#";
				lblHistory.setText(lblHistory.getText()+lblDisplay.getText()+"="+"\n"+ Pojo.GetOutput()+ "\n");
				lblDisplay.setText(Pojo.GetOutput());

			}
		}
	}

	@FXML
	void btnFactorialPressing(ActionEvent event) 
	{
		if(SignFlag()==false)
			lblDisplay.setText(lblDisplay.getText()+"!");
	}

	@FXML
	void btnModPressing(ActionEvent event) 
	{

	}

	@FXML
	void btnMultiplyPressing(ActionEvent event) 
	{
		if(SignFlag()==false)
		{
			flag=true;
			lblDisplay.setText(lblDisplay.getText()+"x");
		}
	}

	@FXML
	void btnNegatePressing(ActionEvent event) 
	{
		/*if(lblDisplay.getText().charAt(0)=='-')
			 lblDisplay.setText(lblDisplay.getText().replace('-', '+'));
		else
		{
			if(lblDisplay.getText().charAt(0)=='+')
				lblDisplay.setText(lblDisplay.getText().replace('+', '-'));
			else
				lblDisplay.setText("-"+lblDisplay.getText());
		}*/
	}

	@FXML
	void btnSqrtPressing(ActionEvent event)
	{
		//خودش جای عدد نتیجه رو همون لحظه مینویسه بعد میاد عملیات رو کامل میکنه. اول عدد بعد این بعد خود جواب
	}

	@FXML
	void btnPowPressing(ActionEvent event) 
	{
		if(SignFlag()==false)
			lblDisplay.setText(lblDisplay.getText()+"^");
	}

	@FXML
	void btnSubtractPressing(ActionEvent event) 
	{
		if(SignFlag()==false)
			lblDisplay.setText(lblDisplay.getText()+"-");
	}

	@FXML
	void btnMemoryAddPressing(ActionEvent event) 
	{
		com.matin.calculator.backend.MemoryHandler.memoryAdd(lblDisplay.getText());
	}

	@FXML
	void btnMemoryClearPressing(ActionEvent event) 
	{
		com.matin.calculator.backend.MemoryHandler.memoryClear();
	}

	@FXML
	void btnMemoryDividePressing(ActionEvent event) 
	{
		com.matin.calculator.backend.MemoryHandler.memoryDivide(lblDisplay.getText());
	}

	@FXML
	void btnMemoryMultiplyPressing(ActionEvent event)
	{
		com.matin.calculator.backend.MemoryHandler.memoryMultiply(lblDisplay.getText());
	}

	@FXML
	void btnMemoryRecallPressing(ActionEvent event) 
	{
		lblDisplay.setText(com.matin.calculator.backend.MemoryHandler.memoryRecall());
	}

	@FXML
	void btnMemorySubtractPressing(ActionEvent event) 
	{
		com.matin.calculator.backend.MemoryHandler.memorySubtract(lblDisplay.getText());
	}

	@FXML
	void btnLoadPressing(ActionEvent event) 
	{
		FileManager loadFile = new FileManager();
		String historyData = loadFile.Load();

		if (historyData == null || historyData.isEmpty())
		{
			Alert HistoryFile= new Alert(Alert.AlertType.WARNING);
			HistoryFile.setTitle("ERROR");
			HistoryFile.setHeaderText(null);
			HistoryFile.setContentText("اطلاعاتی برای لود یافت نشد");
			HistoryFile.showAndWait();
		}
		else
		{
			lblHistory.setText(""); // پاک کردن متن فعلی

			String Return="";
			for (int i=0; i<historyData.length(); i++)
			{
				char ch=historyData.charAt(i);
				if (ch=='=')
					Return+="=\n";
				else if (ch=='#')
					Return+="\n";
				else
					Return+=ch;
			}

			lblHistory.setText(Return);
		}
	}

	@FXML
	void btnSavePressing(ActionEvent event) 
	{
		System.out.println(lblHistory.getText());
		FileManager SaveFile=new FileManager();
		int State=SaveFile.Save(History);
		if(State==0)
		{
			System.out.println("ارور فضای نا کافی");
		}
		else if(State==3)
		{
			System.out.println("مشکل در انجام عملیات");
		}
	}

	@FXML
	void onKeyPressed(KeyEvent event) 
	{
		if (event.getCode() == KeyCode.PERIOD || event.getCode() == KeyCode.DECIMAL) {
			lblDisplay.setText(lblDisplay.getText()+".");
		}
		switch (event.getCode()) {
		case DIGIT0: case NUMPAD0: btn0Pressing(null); break;
		case DIGIT1: if (event.isShiftDown()) 
		{
			btnFactorial.fire();
		} 
		else
		{
			btn1.fire();
		}
		break;
		case NUMPAD1: btn1Pressing(null); break;
		case DIGIT2: case NUMPAD2: btn2Pressing(null); break;
		case DIGIT3: case NUMPAD3: btn3Pressing(null); break;
		case DIGIT4: case NUMPAD4: btn4Pressing(null); break;
		case DIGIT5: if (event.isShiftDown()) 
		{
			btnMod.fire();
		} 
		else
		{
			// فقط 5 زده شده
			btn5.fire();
		}
		break;
		case NUMPAD5: btn5Pressing(null); break;
		case DIGIT6:if (event.isShiftDown()) 
		{
			btnPow.fire();
		} 
		else 
		{
			btn6.fire();
		}
		break;
		case NUMPAD6: btn6Pressing(null); break;
		case DIGIT7: case NUMPAD7: btn7Pressing(null); break;
		case DIGIT8:if (event.isShiftDown()) 
		{
			btnMultiply.fire();
		} 
		else 
		{
			btn8.fire();
		}
		break;
		case NUMPAD8: btn8Pressing(null); break;
		case DIGIT9: case NUMPAD9: btn9Pressing(null); break;

		case PLUS: case ADD: btnAddPressing(null); break;
		case MINUS: case SUBTRACT: btnSubtractPressing(null); break;
		case MULTIPLY: case ASTERISK: btnMultiplyPressing(null); break;
		case DIVIDE: case SLASH: btnDividePressing(null); break;

		case ENTER: case EQUALS: btnEqualsPressing(null); break;
		case BACK_SPACE: btnBackspacePressing(null); break;
		case DELETE: btnCPressing(null); break;
		case PERIOD: btnDotPressing(null); break;
		}


	}

	private boolean SignFlag()
	{
		String Display= lblDisplay.getText();
		char Z=Display.charAt(Display.length()-1);

		if(Z=='+'|| Z=='-'|| Z=='x'|| Z=='÷' || Z=='.')
			return true;
		else
			return false;
	}

}

