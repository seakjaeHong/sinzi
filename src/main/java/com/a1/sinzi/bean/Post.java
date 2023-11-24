package com.a1.sinzi.bean;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Post {
	private int post_no;
	private String board_cd;
	private String post_sj;
	private String post_cn;
	private String regstr_id;
	private Date reg_dt;
}
