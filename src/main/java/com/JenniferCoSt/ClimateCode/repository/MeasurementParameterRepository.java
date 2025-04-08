package com.JenniferCoSt.ClimateCode.repository;

import com.JenniferCoSt.ClimateCode.model.MeasurementParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementParameterRepository extends JpaRepository<MeasurementParameter, Integer> {
}
