package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//Componente do sistema responsável por acessar o banco de dados. Ex: Salvar venda, atualizar, deletar, buscar uma venda
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
