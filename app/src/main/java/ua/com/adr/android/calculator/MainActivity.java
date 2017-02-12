package ua.com.adr.android.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (EditText) findViewById(R.id.txtResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void buttonClick(View view) {

        switch (view.getId()) {
            case R.id.btnAdd:
            case R.id.btnSubtract:
            case R.id.btnDivide:
            case R.id.btnMultiply: {

                break;
            }

            case R.id.btnClear: {

                break;
            }

            case R.id.btnResult: {

                break;
            }

            case R.id.btnComma: {

                break;
            }

            case R.id.btnDelete: {

                break;
            }

            default: {

                txtResult.setText(txtResult.getText() + view.getContentDescription().toString());

            }

        }
    }

}

