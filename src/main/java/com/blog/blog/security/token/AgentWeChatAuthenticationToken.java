package com.blog.blog.security.token;

import com.blog.blog.security.AuthUserDetails;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author Li Yao Bing* @Date 2020/8/14
 **/


public class AgentWeChatAuthenticationToken extends WeChatAuthenticationToken {
    public AgentWeChatAuthenticationToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    public AgentWeChatAuthenticationToken(String code) {
        super(code);
    }

    public AgentWeChatAuthenticationToken(Collection<? extends GrantedAuthority> authorities, AuthUserDetails userDetails, String code) {
        super(authorities, userDetails, code);
    }
}
