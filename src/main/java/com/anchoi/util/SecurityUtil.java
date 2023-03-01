package com.anchoi.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.security.Principal;

public class SecurityUtil {

    @SuppressWarnings("unchecked")
    public static String getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return "ANONYMOUS";
        }
        Principal principal = (Principal) authentication.getPrincipal();

//        KeycloakPrincipal<KeycloakSecurityContext> kPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
//        IDToken token = kPrincipal.getKeycloakSecurityContext().getToken();
//        return token.getPreferredUsername();
        return principal.getName();
    }

//    /**
//     * Get token string
//     *
//     * @return token
//     */
//    @SuppressWarnings("unchecked")
//    public static String getStringToken() {
//        KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null) {
//            return null;
//        }
//        Principal principal = (Principal) authentication.getPrincipal();
//        KeycloakPrincipal<KeycloakSecurityContext> kPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
//        return kPrincipal.getKeycloakSecurityContext().getTokenString();
//    }

//    @SuppressWarnings("unchecked")
//    public static UserInfoDTO getUserInfo() {
//        KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null) {
//            throw new ItsolException(ErrorMessage.AUTH_USER_PASS_INVALID);
//        }
//        Principal principal = (Principal) authentication.getPrincipal();
//        if (!(principal instanceof KeycloakPrincipal)) {
//            throw new ItsolException(ErrorMessage.AUTH_USER_PASS_INVALID);
//        }
//        KeycloakPrincipal<KeycloakSecurityContext> kPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
//        AccessToken token = kPrincipal.getKeycloakSecurityContext().getToken();
//        UserInfoDTO userInfoDTO = new UserInfoDTO();
//        userInfoDTO.setSub(token.getSubject());
//        userInfoDTO.setFullName(token.getName());
//        userInfoDTO.setUsername(token.getPreferredUsername());
//        userInfoDTO.setEmail(token.getEmail());
//        if (token.getResourceAccess() != null) {
//            token.getResourceAccess().forEach((key, value) -> {
//                userInfoDTO.getResourceAccess().put(key, value.getRoles());
//            });
//        }
//        return userInfoDTO;
//    }

}

