package com.tcs.CouponService.services;

import com.tcs.CouponService.models.CouponModel;
import com.tcs.CouponService.repositories.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    CouponRepository couponRepository;

    public CouponModel saveProduct(CouponModel product){
        return couponRepository.save(product);
    }

    public Optional<CouponModel> getCoupon(Long id){
        return couponRepository.findById(id);
    }
}
