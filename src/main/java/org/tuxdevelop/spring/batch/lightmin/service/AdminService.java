package org.tuxdevelop.spring.batch.lightmin.service;

import org.springframework.beans.factory.InitializingBean;
import org.tuxdevelop.spring.batch.lightmin.admin.domain.JobConfiguration;

import java.util.Collection;
import java.util.Map;

public interface AdminService extends InitializingBean {

    /**
     * @param jobConfiguration
     */
    void saveJobConfiguration(JobConfiguration jobConfiguration);

    /**
     * @param jobConfiguration
     */
    void updateJobConfiguration(JobConfiguration jobConfiguration);

    /**
     * @param jobConfigurationId
     */
    void deleteJobConfiguration(final Long jobConfigurationId);

    /**
     * @param jobName
     * @return
     */
    Collection<JobConfiguration> getJobConfigurationsByJobName(String jobName);

    /**
     *
     * @return
     */
    Map<String, Collection<JobConfiguration>> getJobConfigurations();

    JobConfiguration getJobConfigurationById(Long jobConfigurationId);
}