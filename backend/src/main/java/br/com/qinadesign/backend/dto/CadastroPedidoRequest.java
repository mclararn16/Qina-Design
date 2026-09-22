package br.com.qinadesign.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class CadastroPedidoRequest {

    @NotBlank(message = "O nome do cliente é obrigatório")
    private String nomeCliente;

    @NotBlank(message = "O título do pedido é obrigatório")
    private String titulo;

    @NotNull(message = "A data de início é obrigatória")
    private LocalDate dataInicio;

    public CadastroPedidoRequest() {
    }

    public CadastroPedidoRequest(
            String nomeCliente,
            String titulo,
            LocalDate dataInicio
    ) {
        this.nomeCliente = nomeCliente;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}