package com.sha.springbootmicroservice3apigateway.controller;

import com.sha.springbootmicroservice3apigateway.request.PurchaseServiceRequest;
import com.sha.springbootmicroservice3apigateway.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 10.10.2021
 * @time 13:45
 */
@RestController
@RequestMapping("gateway/purchase")//pre-path
public class PurchaseController
{
    @Autowired
    private PurchaseServiceRequest purchaseServiceRequest;

    @PostMapping//gateway/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Object purchase)
    {
        return new ResponseEntity<>(purchaseServiceRequest.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping//gateway/purchase
    public ResponseEntity<?> getAllPurchasesOfAuthorizedUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseServiceRequest.getAllPurchasesOfUser(userPrincipal.getId()));
    }
}
