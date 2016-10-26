package com.ibasara.bbbbb.service.impl;

import org.springframework.stereotype.Service;

import com.ibasara.bbbbb.service.IBbService;

@Service
public class BbServiceImpl implements IBbService {

	@Override
	public String methodb() {
		System.out.println("sb---");
		return "sb";
	}

}
