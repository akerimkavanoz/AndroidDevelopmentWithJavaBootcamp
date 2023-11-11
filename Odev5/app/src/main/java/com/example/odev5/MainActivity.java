package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.example.odev5.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonSil.setEnabled(false);
        butondakiVeriyiTextViewAktar(binding.button0, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button1, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button2, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button3, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button4, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button5, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button6, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button7, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button8, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.button9, binding.textViewSonuc);
        butondakiVeriyiTextViewAktar(binding.buttonArti, binding.textViewSonuc);
        binding.buttonEsittir.setOnClickListener(v -> {
            if (binding.textViewSonuc.getText().toString().isEmpty()){
                Snackbar.make(binding.textViewSonuc, "Önce işlem yapmalısın !", Snackbar.LENGTH_SHORT).show();
            }
            else{
                hesaplama(binding.textViewSonuc);
            }

        });
        binding.buttonSifirla.setOnClickListener(v -> {
            binding.textViewSonuc.setText("");
            binding.buttonSil.setEnabled(false);
        });

        binding.buttonSil.setOnClickListener(v -> {
            sil(binding.buttonSil,binding.textViewSonuc);
        });
    }
    private void butondakiVeriyiTextViewAktar(Button button, TextView textView) {
        button.setOnClickListener(v -> {

            String alinanVeri = button.getText().toString();
            String textVeri = textView.getText().toString();
            if(!textVeri.isEmpty()) {
                binding.buttonSil.setEnabled(true);
                char artiKontrol = textVeri.charAt(textVeri.length() - 1);
                if (artiKontrol == '+' && alinanVeri.equals("+")) {
                    Snackbar.make(textView, "Tekrar + giremezsin !", Snackbar.LENGTH_SHORT).show();
                }
                else {
                    textView.setText(textView.getText()+alinanVeri);
                }
            }
            else if (textVeri.isEmpty() && !alinanVeri.equals("+")) {
                textView.setText(textView.getText()+alinanVeri);
                binding.buttonSil.setEnabled(true);
            }
            else if (alinanVeri.equals("+")){
                Snackbar.make(textView, "İşlemden önce sayı girmelisin !", Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void hesaplama(TextView textView) {
        String str = textView.getText().toString();
        String[] sayilar = str.split("\\+");

        if(sayilar.length > 1) {
            long toplam = 0;
            for (int i = 0; i < sayilar.length; i++) {
                toplam += Long.parseLong(sayilar[i]);
            }
            String sonuc = String.valueOf(toplam);
            textView.setText(sonuc);
        }
    }

    private void sil(Button button, TextView textView) {
        if (!textView.getText().toString().isEmpty()) {
            String gelenText = textView.getText().toString();
            String sonuc = gelenText.substring(0, gelenText.length() - 1);
            textView.setText(sonuc);

            if (textView.getText().toString().isEmpty()) {
                button.setEnabled(false);
            }
        }
    }
}