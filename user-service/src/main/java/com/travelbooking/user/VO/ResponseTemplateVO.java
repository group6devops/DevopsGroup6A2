package com.travelbooking.user.VO;




import com.travelbooking.user.entity.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private UserInfo userInfo;
    private Flight flight;
	public void setUser(UserInfo userInfo2) {
		// TODO Auto-generated method stub
		userInfo = userInfo2;
	}
	public void setFlight(Flight flight2) {
		// TODO Auto-generated method stub
		flight = flight2;
	}



}
