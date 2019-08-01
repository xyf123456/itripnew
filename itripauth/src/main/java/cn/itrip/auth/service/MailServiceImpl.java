package cn.itrip.auth.service;

import cn.itrip.common.RedisAPI;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 邮件发送接口的实现
 * @author hduser
 *
 */
@Service("mailService")
@Transactional
public class MailServiceImpl implements MailService {

	@Resource
	private MailSender mailSender;
	@Resource
	private RedisAPI redisAPI;

//	@Resource
//	private JavaMailSender mailSender;
	/**
	 * 发送注册激活邮件
	 */
	public void sendActivationMail(String mailTo, String activationCode) {
		SimpleMailMessage activationMailMessage = new SimpleMailMessage();
		activationMailMessage.setTo(mailTo);
		activationMailMessage.setText("注册邮箱："+mailTo +"  激活码："+activationCode);
		mailSender.send(activationMailMessage);
		this.saveActivationInfo("activation:"+mailTo, activationCode);
	}

	/**
	 * 保存激活信息
	 * 
	 * @param key
	 * @param value
	 */
	private void saveActivationInfo(String key, String value) {
		redisAPI.set(key, 30*60, value);
	}
}
