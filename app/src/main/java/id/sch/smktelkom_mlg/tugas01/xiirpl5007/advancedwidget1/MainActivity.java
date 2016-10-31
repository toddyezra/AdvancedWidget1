package id.sch.smktelkom_mlg.tugas01.xiirpl5007.advancedwidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

        final EditText etNama = new EditText(this);
        llMain.addView(etNama);
        etNama.setHint("Isikan nama anak");

        final EditText etUmur = new EditText(this);
        llMain.addView(etUmur);
        etUmur.setHint("Isikan umur anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

        Button bproses = new Button(this);
        bproses.setText("proses");
        llMain.addView(bproses);
        final TextView tvHasil = new TextView(this);
        llMain.addView(tvHasil);

        bproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvHasil.setText(nama + " umur " + umur + " Tahun ");
            }


        });
    }
}
