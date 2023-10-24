package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferência = FirebaseDatabase.getInstance().getReference("Clientes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //aqui estou colocando o ID de cada cliente e estou colocando o campo nome e preenchendo com o nome do cliente
        minhaReferência.child("ID").child("001").child("Nome Do Cliente").setValue("Leonardo");
        minhaReferência.child("ID").child("002").child("Nome Do Cliente").setValue("Silvia");
        minhaReferência.child("ID").child("003").child("Nome Do Cliente").setValue("Carlos");
        minhaReferência.child("ID").child("004").child("Nome Do Cliente").setValue("Thales");
        minhaReferência.child("ID").child("005").child("Nome Do Cliente").setValue("Mariana");
        minhaReferência.child("ID").child("006").child("Nome Do Cliente").setValue("Mariana");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo email e preenchendo com o email do cliente
        minhaReferência.child("ID").child("001").child("Email").setValue("lenardo@gmail.com");
        minhaReferência.child("ID").child("002").child("Email").setValue("Silvia@gmail.com");
        minhaReferência.child("ID").child("003").child("Email").setValue("Carlos@gmail.com");
        minhaReferência.child("ID").child("004").child("Email").setValue("Thales@gmail.com");
        minhaReferência.child("ID").child("005").child("Email").setValue("Mariana@gmail.com");
        minhaReferência.child("ID").child("006").child("Email").setValue("Mariana@gmail.com");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo celular e preenchendo com o celular do cliente
        minhaReferência.child("ID").child("001").child("Celular").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("002").child("Celular").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("003").child("Celular").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("004").child("Celular").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("005").child("Celular").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("006").child("Celular").setValue("+55 (11) 99999-9999");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo telefone e preenchendo com o telefone do cliente
        minhaReferência.child("ID").child("001").child("Telefone").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("002").child("Telefone").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("003").child("Telefone").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("004").child("Telefone").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("005").child("Telefone").setValue("+55 (11) 99999-9999");
        minhaReferência.child("ID").child("006").child("Telefone").setValue("+55 (11) 99999-9999");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo endereço e preenchendo com o endereço do cliente
        minhaReferência.child("ID").child("001").child("Endereço").setValue("Rua das Anônimas");
        minhaReferência.child("ID").child("002").child("Endereço").setValue("Rua dos Caga Tronco");
        minhaReferência.child("ID").child("003").child("Endereço").setValue("Rua do Mussarelo");
        minhaReferência.child("ID").child("004").child("Endereço").setValue("Rua do Ludimilo");
        minhaReferência.child("ID").child("005").child("Endereço").setValue("Rua dos três mosqueteiros");
        minhaReferência.child("ID").child("006").child("Endereço").setValue("Rua dos três mosqueteiros");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo complemento e preenchendo com o complemento do cliente
        minhaReferência.child("ID").child("001").child("Complemento").setValue("Casa");
        minhaReferência.child("ID").child("002").child("Complemento").setValue("Bloco C - apt 99");
        minhaReferência.child("ID").child("003").child("Complemento").setValue("Casa");
        minhaReferência.child("ID").child("004").child("Complemento").setValue("Casa 7");
        minhaReferência.child("ID").child("005").child("Complemento").setValue("Apt - 4");
        minhaReferência.child("ID").child("006").child("Complemento").setValue("Apt - 4");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo estado e preenchendo com o estado do cliente
        minhaReferência.child("ID").child("001").child("Estado").setValue("São Paulo");
        minhaReferência.child("ID").child("002").child("Estado").setValue("Acre");
        minhaReferência.child("ID").child("003").child("Estado").setValue("Rio de Janeiro");
        minhaReferência.child("ID").child("004").child("Estado").setValue("Amazonas");
        minhaReferência.child("ID").child("005").child("Estado").setValue("Minas Gerais");
        minhaReferência.child("ID").child("006").child("Estado").setValue("Minas Gerais");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo cidade e preenchendo com o cidade do cliente
        minhaReferência.child("ID").child("001").child("Cidade").setValue("São Paulo");
        minhaReferência.child("ID").child("002").child("Cidade").setValue("Rio Branco");
        minhaReferência.child("ID").child("003").child("Cidade").setValue("Duque de Caxias");
        minhaReferência.child("ID").child("004").child("Cidade").setValue("Tapauá");
        minhaReferência.child("ID").child("005").child("Cidade").setValue("Uberlândia");
        minhaReferência.child("ID").child("006").child("Cidade").setValue("Uberlândia");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo CEP e preenchendo com o CEP do cliente
        minhaReferência.child("ID").child("001").child("CEP").setValue("00000-000");
        minhaReferência.child("ID").child("002").child("CEP").setValue("00000-000");
        minhaReferência.child("ID").child("003").child("CEP").setValue("00000-000");
        minhaReferência.child("ID").child("004").child("CEP").setValue("00000-000");
        minhaReferência.child("ID").child("005").child("CEP").setValue("00000-000");
        minhaReferência.child("ID").child("006").child("CEP").setValue("00000-000");


        //aqui estou colocando o ID de cada cliente e estou colocando o campo status e preenchendo com o status do cliente
        minhaReferência.child("ID").child("001").child("Status").setValue("Ativo");
        minhaReferência.child("ID").child("002").child("Status").setValue("Ativo");
        minhaReferência.child("ID").child("003").child("Status").setValue("Inativo");
        minhaReferência.child("ID").child("004").child("Status").setValue("Inativo");
        minhaReferência.child("ID").child("005").child("Status").setValue("Ativo");
        minhaReferência.child("ID").child("006").child("Status").setValue("Ativo");



    }
}