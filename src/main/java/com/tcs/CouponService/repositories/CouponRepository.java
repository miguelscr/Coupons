package com.tcs.CouponService.repositories;

import com.tcs.CouponService.models.CouponModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends CrudRepository<CouponModel,Long> {
}
