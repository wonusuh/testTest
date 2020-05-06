/**
 * 
 */
package kr.or.yonsai.domain;

import java.util.Date;

import lombok.Data;

/**
 * @author YONSAI
 *
 */
@Data
public class ReplyVO {

	private int rno;
	private int bno;

	private String reply;
	private String replyer;
	private Date replydate;
	private Date updatedate;

}
