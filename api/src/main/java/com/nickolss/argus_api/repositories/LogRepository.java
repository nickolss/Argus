package com.nickolss.argus_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nickolss.argus_api.models.Log;

public interface LogRepository extends JpaRepository<Log, Long> {

}
