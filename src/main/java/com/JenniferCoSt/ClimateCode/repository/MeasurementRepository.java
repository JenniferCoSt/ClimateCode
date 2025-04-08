package com.JenniferCoSt.ClimateCode.repository;

import com.JenniferCoSt.ClimateCode.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
