package com.coral.controller;

import com.coral.model.InsuredVO;
import com.coral.model.InterestVO;
import com.coral.model.PolicyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by ccc on 2018/4/16.
 */
@Api(value = "PolicyController", description = "保单接口")
@Controller
@RequestMapping("/policy")
public class PolicyController {

    @ApiOperation("保单保存")
    @RequestMapping(value="/save", method= RequestMethod.POST)
    public @ResponseBody PolicyVO savePolicy(@RequestBody PolicyVO policyVO) {
        policyVO.setPolicyId(UUID.randomUUID().toString());
        List<InsuredVO> insuredVOs = policyVO.getInsuredVOList();
        for(InsuredVO insuredVO : insuredVOs) {
            insuredVO.setInsuredId(UUID.randomUUID().toString());
            List<InterestVO> interestVOs = insuredVO.getInterestVOList();
            for(InterestVO interestVO : interestVOs) {
                interestVO.setInterestId(UUID.randomUUID().toString());
            }
        }
        return policyVO;
    }
}
