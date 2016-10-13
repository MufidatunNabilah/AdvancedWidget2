package id.sch.smktelkom_mlg.learn.advancedwidget2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.editTextNama)
    EditText etNama;
    @BindView(R.id.textViewHasil)
    TextView tvHasil;
    @BindColor(R.color.colorAccent)
    int ColorAccent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvHasil.setTextColor(ColorAccent);
    }

    @OnClick(R.id.buttonProses)
    public void doProcess(){
        tvHasil.setText("Nama Anda: "+etNama.getText());
    }
}
