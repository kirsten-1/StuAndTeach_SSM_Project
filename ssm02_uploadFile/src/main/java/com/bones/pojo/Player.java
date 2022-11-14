package com.bones.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String nickname;
    private String photo;
    private String filetype;
}
