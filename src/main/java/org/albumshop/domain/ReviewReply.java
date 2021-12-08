package org.albumshop.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="reviewReply")
public class ReviewReply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@NotNull
	private Review review;
	@ManyToOne
	@NotNull
	private User user;
	@NotNull
	private String content;
	@CreationTimestamp
	@NotNull
	private Timestamp regDate;
	@UpdateTimestamp
	@NotNull
	private Timestamp updateDate;
	private Integer likeCount;
	
}
