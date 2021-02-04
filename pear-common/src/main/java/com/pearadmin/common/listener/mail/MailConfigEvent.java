package com.pearadmin.common.listener.mail;

import org.springframework.context.ApplicationEvent;

import java.util.Map;


/**
 * Describe: 添 加 邮 箱 配 置 之 后，发 布 邮 箱 配 置 事 件
 * Author: BoscoKuo
 * CreateTime: 2021/2/4 11:23
 */
public class MailConfigEvent extends ApplicationEvent {

    private Map<String, String> mailConfig;

    public MailConfigEvent(Object source, Map<String, String> mailConfig) {
        super(source);
        this.mailConfig = mailConfig;
    }

    public Map<String, String> getMailConfig() {
        return mailConfig;
    }

}
