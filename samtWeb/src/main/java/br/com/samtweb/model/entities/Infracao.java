
package br.com.samtweb.model.entities;

/**
 * @autor: Adalberto Kamida
 * @dt. inclusao: 01/09/2015
 */

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Entity
@Table(name="infracao")
public class Infracao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_hashInfracao", nullable=false, length=64)
    private String id_hashInfracao;
    @Column(name="nr_codigoLocal", nullable=false, length=4)
    private int nr_codigoLocal;
    @Column(name="nr_longitude", nullable=false, precision=11, scale=8)
    private Float nr_longitude;
    @Column(name="nr_latitude", nullable=false, precision=11, scale=8)
    private Float nr_latitude;
    @Column(name="nr_faixa", nullable=false, length=1)
    private int nr_faixa;
    @Column(name="dc_serieEquipameto", nullable=false, length=16)
    private String dc_serieEquipameto;
    @Column(name="dataJuliana", nullable=false, length=8)
    private int dataJuliana;
    @Column(name="dt_dataInfracao", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dt_dataInfracao;
    @Column(name="dt_dataInfracaoUTC", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dt_dataInfracaoUTC;
    @Column(name="hr_horaInfracao", nullable=false, length=8)
    private String hr_horaInfracao;
    @Column(name="hr_horaInfracaoUTC", nullable=false, length=8)
    private String hr_horaInfracaoUTC;
    @Column(name="nr_dataHoraInfracao", nullable=false, length=10)
    private int nr_dataHoraInfracao;
    @Column(name="nr_codigoInfracao", nullable=false, length=10)
    private BigDecimal nr_codigoInfracao;
    @Column(name="dc_urlInfracao", nullable=false, length=100)
    private String dc_urlInfracao;
    @Column(name="lg_veiculoEstado", nullable=false, length=1)
    private int lg_veiculoEstado;
    @Column(name="nr_tipoEquipamento", nullable=false, length=2)
    private int nr_tipoEquipamento;
    @Column(name="nr_porteVeiculo", nullable=false, length=1)
    private int nr_porteVeiculo;
    @Column(name="nr_tamanhoVeiculo", nullable=false, precision=4, scale=2)
    private Float nr_tamanhoVeiculo;
    @Column(name="nr_classificacaoVeiculo", nullable=false, length=1)
    private int nr_classificacaoVeiculo;
    @Column(name="nr_sentidoVeiculo", nullable=false, length=1)
    private int nr_sentidoVeiculo;
    @Column(name="nr_velocidadePermitida", nullable=false, length=3)
    private int nr_velocidadePermitida;
    @Column(name="nr_velocidadeTolerada", nullable=false, length=3)
    private int nr_velocidadeTolerada;
    @Column(name="nr_velocidadeRegistrada", nullable=false, precision=5, scale=1)
    private Float nr_velocidadeRegistrada;
    @Column(name="nr_velocidadeConsiderada", nullable=false, precision=5, scale=1)
    private Float nr_velocidadeConsiderada;
    @Column(name="nr_tempoPerdaoSemaforo", nullable=false, length=2)
    private int nr_tempoPerdaoSemaforo;
    @Column(name="nr_tempoPerdaoParada", nullable=false, length=2)
    private int nr_tempoPerdaoParada;
    @Column(name="nr_versao", nullable=false, length=10)
    private String nr_versao;
    @Column(name="nr_gravaTarja", nullable=false, length=2)
    private int nr_gravaTarja;
    @Column(name="nr_posicaoTarja", nullable=false, length=2)
    private int nr_posicaoTarja;
    @Column(name="nr_numeroLinhasTarja", nullable=false, length=1)
    private int nr_numeroLinhasTarja;
    @Column(name="nr_tipoImagem", nullable=false, length=2)
    private int nr_tipoImagem;
    @Column(name="nr_distanciaFaixaRetencao", nullable=false, length=2)
    private int nr_distancaiFaixaRetencao;
    @Column(name="nr_distanciaRegistrada", nullable=false, precision=9, scale=2)
    private Float nr_distanciaRegistrada;
    @Column(name="nr_numeroSequencialVeiculo", nullable=false, length=10)
    private int nr_numeroSequencialVeiculo;
    @Column(name="nr_numeroSequencialVeiculoInfrator", nullable=false, length=10)
    private int nr_numeroSequencialVeiculoInfrator;
    @Column(name="nr_numeroSequencialInfracao", nullable=false, length=10)
    private int nr_numeroSequencialInfracao;
    @Column(name="dh_recebimento", nullable=false, length=20)
    private String dh_recebimento;
    @Column(name="dh_transferencia", nullable=false, length=20)
    private String dh_transferencia;
    @Column(name="dc_matriculaAgente", nullable=false, length=20)
    private String dc_matriculaAgente;
    @Column(name="fk_enquadramento", nullable=false, length=10)
    private int fk_enquadramento;
    @Column(name="fk_processo", nullable=false, length=4)
    private int fk_processo;
    @Column(name="fk_status", nullable=false, length=2)
    private int fk_status;
    @Column(name="fk_tipoInconsistencia", nullable=false, length=4)
    private int fk_tipoInconsistencia;
    @Column(name="dc_placaVeiculo", nullable=false, length=16)
     private String dc_placaVeiculo;

    public String getId_hashInfracao() {
        return id_hashInfracao;
    }

    public void setId_hashInfracao(String id_hashInfracao) {
        this.id_hashInfracao = id_hashInfracao;
    }

    public int getNr_codigoLocal() {
        return nr_codigoLocal;
    }

    public void setNr_codigoLocal(int nr_codigoLocal) {
        this.nr_codigoLocal = nr_codigoLocal;
    }

    public Float getNr_longitude() {
        return nr_longitude;
    }

    public void setNr_longitude(Float nr_longitude) {
        this.nr_longitude = nr_longitude;
    }

    public Float getNr_latitude() {
        return nr_latitude;
    }

    public void setNr_latitude(Float nr_latitude) {
        this.nr_latitude = nr_latitude;
    }

    public int getNr_faixa() {
        return nr_faixa;
    }

    public void setNr_faixa(int nr_faixa) {
        this.nr_faixa = nr_faixa;
    }

    public String getDc_serieEquipameto() {
        return dc_serieEquipameto;
    }

    public void setDc_serieEquipameto(String dc_serieEquipameto) {
        this.dc_serieEquipameto = dc_serieEquipameto;
    }

    public int getDataJuliana() {
        return dataJuliana;
    }

    public void setDataJuliana(int dataJuliana) {
        this.dataJuliana = dataJuliana;
    }

    public Date getDt_dataInfracao() {
        return dt_dataInfracao;
    }

    public void setDt_dataInfracao(Date dt_dataInfracao) {
        this.dt_dataInfracao = dt_dataInfracao;
    }

    public Date getDt_dataInfracaoUTC() {
        return dt_dataInfracaoUTC;
    }

    public void setDt_dataInfracaoUTC(Date dt_dataInfracaoUTC) {
        this.dt_dataInfracaoUTC = dt_dataInfracaoUTC;
    }

    public String getHr_horaInfracao() {
        return hr_horaInfracao;
    }

    public void setHr_horaInfracao(String hr_horaInfracao) {
        this.hr_horaInfracao = hr_horaInfracao;
    }

    public String getHr_horaInfracaoUTC() {
        return hr_horaInfracaoUTC;
    }

    public void setHr_horaInfracaoUTC(String hr_horaInfracaoUTC) {
        this.hr_horaInfracaoUTC = hr_horaInfracaoUTC;
    }

    public int getNr_dataHoraInfracao() {
        return nr_dataHoraInfracao;
    }

    public void setNr_dataHoraInfracao(int nr_dataHoraInfracao) {
        this.nr_dataHoraInfracao = nr_dataHoraInfracao;
    }

    public BigDecimal getNr_codigoInfracao() {
        return nr_codigoInfracao;
    }

    public void setNr_codigoInfracao(BigDecimal nr_codigoInfracao) {
        this.nr_codigoInfracao = nr_codigoInfracao;
    }

    public String getDc_urlInfracao() {
        return dc_urlInfracao;
    }

    public void setDc_urlInfracao(String dc_urlInfracao) {
        this.dc_urlInfracao = dc_urlInfracao;
    }

    public int getLg_veiculoEstado() {
        return lg_veiculoEstado;
    }

    public void setLg_veiculoEstado(int lg_veiculoEstado) {
        this.lg_veiculoEstado = lg_veiculoEstado;
    }

    public int getNr_tipoEquipamento() {
        return nr_tipoEquipamento;
    }

    public void setNr_tipoEquipamento(int nr_tipoEquipamento) {
        this.nr_tipoEquipamento = nr_tipoEquipamento;
    }

    public int getNr_porteVeiculo() {
        return nr_porteVeiculo;
    }

    public void setNr_porteVeiculo(int nr_porteVeiculo) {
        this.nr_porteVeiculo = nr_porteVeiculo;
    }

    public Float getNr_tamanhoVeiculo() {
        return nr_tamanhoVeiculo;
    }

    public void setNr_tamanhoVeiculo(Float nr_tamanhoVeiculo) {
        this.nr_tamanhoVeiculo = nr_tamanhoVeiculo;
    }

    public int getNr_classificacaoVeiculo() {
        return nr_classificacaoVeiculo;
    }

    public void setNr_classificacaoVeiculo(int nr_classificacaoVeiculo) {
        this.nr_classificacaoVeiculo = nr_classificacaoVeiculo;
    }

    public int getNr_sentidoVeiculo() {
        return nr_sentidoVeiculo;
    }

    public void setNr_sentidoVeiculo(int nr_sentidoVeiculo) {
        this.nr_sentidoVeiculo = nr_sentidoVeiculo;
    }

    public int getNr_velocidadePermitida() {
        return nr_velocidadePermitida;
    }

    public void setNr_velocidadePermitida(int nr_velocidadePermitida) {
        this.nr_velocidadePermitida = nr_velocidadePermitida;
    }

    public int getNr_velocidadeTolerada() {
        return nr_velocidadeTolerada;
    }

    public void setNr_velocidadeTolerada(int nr_velocidadeTolerada) {
        this.nr_velocidadeTolerada = nr_velocidadeTolerada;
    }

    public Float getNr_velocidadeRegistrada() {
        return nr_velocidadeRegistrada;
    }

    public void setNr_velocidadeRegistrada(Float nr_velocidadeRegistrada) {
        this.nr_velocidadeRegistrada = nr_velocidadeRegistrada;
    }

    public Float getNr_velocidadeConsiderada() {
        return nr_velocidadeConsiderada;
    }

    public void setNr_velocidadeConsiderada(Float nr_velocidadeConsiderada) {
        this.nr_velocidadeConsiderada = nr_velocidadeConsiderada;
    }

    public int getNr_tempoPerdaoSemaforo() {
        return nr_tempoPerdaoSemaforo;
    }

    public void setNr_tempoPerdaoSemaforo(int nr_tempoPerdaoSemaforo) {
        this.nr_tempoPerdaoSemaforo = nr_tempoPerdaoSemaforo;
    }

    public int getNr_tempoPerdaoParada() {
        return nr_tempoPerdaoParada;
    }

    public void setNr_tempoPerdaoParada(int nr_tempoPerdaoParada) {
        this.nr_tempoPerdaoParada = nr_tempoPerdaoParada;
    }

    public String getNr_versao() {
        return nr_versao;
    }

    public void setNr_versao(String nr_versao) {
        this.nr_versao = nr_versao;
    }

    public int getNr_gravaTarja() {
        return nr_gravaTarja;
    }

    public void setNr_gravaTarja(int nr_gravaTarja) {
        this.nr_gravaTarja = nr_gravaTarja;
    }

    public int getNr_posicaoTarja() {
        return nr_posicaoTarja;
    }

    public void setNr_posicaoTarja(int nr_posicaoTarja) {
        this.nr_posicaoTarja = nr_posicaoTarja;
    }

    public int getNr_numeroLinhasTarja() {
        return nr_numeroLinhasTarja;
    }

    public void setNr_numeroLinhasTarja(int nr_numeroLinhasTarja) {
        this.nr_numeroLinhasTarja = nr_numeroLinhasTarja;
    }

    public int getNr_tipoImagem() {
        return nr_tipoImagem;
    }

    public void setNr_tipoImagem(int nr_tipoImagem) {
        this.nr_tipoImagem = nr_tipoImagem;
    }

    public int getNr_distancaiFaixaRetencao() {
        return nr_distancaiFaixaRetencao;
    }

    public void setNr_distancaiFaixaRetencao(int nr_distancaiFaixaRetencao) {
        this.nr_distancaiFaixaRetencao = nr_distancaiFaixaRetencao;
    }

    public Float getNr_distanciaRegistrada() {
        return nr_distanciaRegistrada;
    }

    public void setNr_distanciaRegistrada(Float nr_distanciaRegistrada) {
        this.nr_distanciaRegistrada = nr_distanciaRegistrada;
    }

    public int getNr_numeroSequencialVeiculo() {
        return nr_numeroSequencialVeiculo;
    }

    public void setNr_numeroSequencialVeiculo(int nr_numeroSequencialVeiculo) {
        this.nr_numeroSequencialVeiculo = nr_numeroSequencialVeiculo;
    }

    public int getNr_numeroSequencialVeiculoInfrator() {
        return nr_numeroSequencialVeiculoInfrator;
    }

    public void setNr_numeroSequencialVeiculoInfrator(int nr_numeroSequencialVeiculoInfrator) {
        this.nr_numeroSequencialVeiculoInfrator = nr_numeroSequencialVeiculoInfrator;
    }

    public int getNr_numeroSequencialInfracao() {
        return nr_numeroSequencialInfracao;
    }

    public void setNr_numeroSequencialInfracao(int nr_numeroSequencialInfracao) {
        this.nr_numeroSequencialInfracao = nr_numeroSequencialInfracao;
    }

    public String getDh_recebimento() {
        return dh_recebimento;
    }

    public void setDh_recebimento(String dh_recebimento) {
        this.dh_recebimento = dh_recebimento;
    }

    public String getDh_transferencia() {
        return dh_transferencia;
    }

    public void setDh_transferencia(String dh_transferencia) {
        this.dh_transferencia = dh_transferencia;
    }

    public String getDc_matriculaAgente() {
        return dc_matriculaAgente;
    }

    public void setDc_matriculaAgente(String dc_matriculaAgente) {
        this.dc_matriculaAgente = dc_matriculaAgente;
    }

    public int getFk_enquadramento() {
        return fk_enquadramento;
    }

    public void setFk_enquadramento(int fk_enquadramento) {
        this.fk_enquadramento = fk_enquadramento;
    }

    public int getFk_processo() {
        return fk_processo;
    }

    public void setFk_processo(int fk_processo) {
        this.fk_processo = fk_processo;
    }

    public int getFk_status() {
        return fk_status;
    }

    public void setFk_status(int fk_status) {
        this.fk_status = fk_status;
    }

    public int getFk_tipoInconsistencia() {
        return fk_tipoInconsistencia;
    }

    public void setFk_tipoInconsistencia(int fk_tipoInconsistencia) {
        this.fk_tipoInconsistencia = fk_tipoInconsistencia;
    }

    public String getDc_placaVeiculo() {
        return dc_placaVeiculo;
    }

    public void setDc_placaVeiculo(String dc_placaVeiculo) {
        this.dc_placaVeiculo = dc_placaVeiculo;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (this.id_hashInfracao != null ? this.id_hashInfracao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Infracao other = (Infracao) obj;
        if ((this.id_hashInfracao == null) ? (other.id_hashInfracao != null) : !this.id_hashInfracao.equals(other.id_hashInfracao)) {
            return false;
        }
        return true;
    }



}
