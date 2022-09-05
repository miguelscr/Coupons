package com.tcs.CouponService.controller;

import com.tcs.CouponService.models.CouponModel;
import com.tcs.CouponService.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CouponController {
    @Autowired
    CouponService couponService;

    @PostMapping("/post")
    public CouponModel insertCoupon(@RequestBody CouponModel coupon){
        return this.couponService.saveProduct(coupon);
    }

    @GetMapping("/getCoupon/{id}")
    public Optional<CouponModel> getById(@PathVariable Long id){
        return this.couponService.getCoupon(id);
    }
}
