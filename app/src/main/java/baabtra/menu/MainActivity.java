package baabtra.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        registerForContextMenu(relativeLayout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case  R.id.bookmark :
                Toast.makeText(getApplicationContext(), "Bookmarked", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.save :
                Toast.makeText(getApplicationContext(),"Page Saved",Toast.LENGTH_SHORT ).show();
                return true;
            case  R.id.search :
                Toast.makeText(getApplicationContext(),"Search is Selected",Toast.LENGTH_SHORT ).show();
                return true;
            case  R.id.share :
                Toast.makeText(getApplicationContext(),"Share is Selected",Toast.LENGTH_SHORT ).show();
                return true;
            case  R.id.delete :
                Toast.makeText(getApplicationContext(),"Page Deleted",Toast.LENGTH_SHORT ).show();
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.contextmenu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case  R.id.selectall :
                Toast.makeText(getApplicationContext(),"Selected All",Toast.LENGTH_SHORT ).show();
                return true;
            case  R.id.copy :
                Toast.makeText(getApplicationContext(),"Copied",Toast.LENGTH_SHORT ).show();
                return true;
            case  R.id.paste :
                Toast.makeText(getApplicationContext(),"Paste Here ",Toast.LENGTH_SHORT ).show();
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }
}