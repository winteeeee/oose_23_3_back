package com.example.oose_23_3_back.managementcontrol.entity;
import com.example.oose_23_3_back.noticecontrol.entity.Post;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class RentalOffice {
    @Id
    private Long rentalOfficeNum;
    private String rentalOfficeName;
    private Integer maximumBicycle;
    @OneToMany(mappedBy = "rentalOffice")
    @JsonManagedReference
    private List<Bicycle> bicycleList;
    @OneToMany
    private List<Post> noticeList;
}
