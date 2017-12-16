package br.com.fasam.pos.bigdata.MoviesSearchPos.model;

import java.io.Serializable;

public class Filme implements Serializable{
	private static final long serialVersionUID = 2399028824723797630L;

	private String movie_title;
	private Date movie_launch_at;
	private String movie_synopsis;
	private Double movie_reputation;
}
