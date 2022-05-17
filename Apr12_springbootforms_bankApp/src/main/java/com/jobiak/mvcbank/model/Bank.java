package com.jobiak.mvcbank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="bankdetails")
public class Bank 
{
@Id
private Long accountId;
private String name;
private String mobile;
private String balance;




}
