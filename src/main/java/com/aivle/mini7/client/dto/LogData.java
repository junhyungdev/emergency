package com.aivle.mini7.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogData {
    private int log_id;
    private String datetime;
    private String file_name;
    private String input_text;
    private float input_lat;
    private float input_lon;
    private int em_class;
    private String hospital1;
    private String addr1;
    private String tel1;
    private String hospital2;
    private String addr2;
    private String tel2;
    private String hospital3;
    private String addr3;
    private String tel3;
    private String emergencyAudio;
}
