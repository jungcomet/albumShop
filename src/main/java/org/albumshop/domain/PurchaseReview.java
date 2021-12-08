package org.albumshop.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name="purchaseReview")
public class PurchaseReview implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	private Delivery delivery;
	@NotNull
	private String title;
	@NotNull
	private String content;
	@CreationTimestamp
	@NotNull
	private Timestamp regDate;
	@UpdateTimestamp
	@NotNull
	private Timestamp updateDate;
	
}
