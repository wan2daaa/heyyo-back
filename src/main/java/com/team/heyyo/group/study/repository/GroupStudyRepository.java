package com.team.heyyo.group.study.repository;

import com.team.heyyo.group.study.domain.GroupStudy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupStudyRepository extends JpaRepository<GroupStudy, Long> ,GroupStudyRepositoryCustom{
}
