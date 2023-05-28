package com.example.oose_23_3_back.managementcontrol;
import com.example.oose_23_3_back.noticecontrol.Post;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class RentalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentalOfficeNum;
    private String rentalOfficeName;
    private Integer maximumBicycle;
    @OneToMany(mappedBy = "bicycle")
    private List<Bicycle> bicycleList;
    @OneToMany
    private List<Post> noticeList;
}
