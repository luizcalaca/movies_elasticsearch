package br.com.fasam.pos.bigdata.MoviesSearchPos.model;

import java.io.Serializable;
import java.util.Date;

public class Filme implements Serializable{
	private static final long serialVersionUID = 2399028824723797630L;

	private String titulo;
	private Date lacamento;
	private String sinopse;
	private Double reputacao;
}
