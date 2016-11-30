package de.rocketfox.spendings;

import android.content.Intent;
import android.os.Bundle;
import com.github.clans.fab.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initFloatingButtons();
    }

    private void updateBudgetView(Double amount) {
        TextView budgetInfoHeader = (TextView) findViewById(R.id.text_main_BudgetDisplay);
        budgetInfoHeader.setText(amount.toString());
    }

    private void initFloatingButtons() {
        FloatingActionButton fabOnce = (FloatingActionButton) findViewById(R.id.menu_item_addOneTime);
        fabOnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRecurralTransaction();
            }
        });

        FloatingActionButton fabRecurral = (FloatingActionButton) findViewById(R.id.menu_item_addRecurral);
        fabRecurral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOneTimeTransaction();
            }
        });
    }

    private void addOneTimeTransaction() {
        Intent intent = new Intent(this, AddOneTimePayment.class);
        startActivity(intent);
    }

    private void addRecurralTransaction() {
        Intent intent = new Intent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
