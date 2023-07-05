package com.example.rs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transfer {
    String dno;
    String yno;
    String bno;
    String gangWei;
    String reason;
    String transferDate;
}
