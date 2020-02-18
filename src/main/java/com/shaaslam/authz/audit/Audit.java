package com.shaaslam.authz.audit;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
    value = {"createdBy", "createdAt", "updatedBy", "updatedAt"},
    allowGetters = true
)
@Getter
@Setter
public abstract class Audit implements Serializable {

    @CreatedBy
    private Long createdBy;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedBy
    private Long updatedBy;

    @LastModifiedDate
    private Instant updatedAt;
}
