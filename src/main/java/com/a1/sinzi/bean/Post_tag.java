package com.a1.sinzi.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Post_tag {
	private int board_tag_id;
	private int post_no;
	private String board_cd;
	private int tag_id;
}
