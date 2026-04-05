package com.michel.userEmail.producers;

import com.michel.userEmail.configs.RabbiMQConfig;
import com.michel.userEmail.dtos.EmailDto;
import com.michel.userEmail.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//é essa classe que vai transmitir as mensagens para o homebroque
@Component
public class UserProducer {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value(value = "${spring.rabbitmq.queue}")
    private String routingKey;

    public void publishMessageEmail(UserModel userModel){
        var emailDtO = new EmailDto();
        emailDtO.setUserId(userModel.getUserId());
        emailDtO.setEmailTo(userModel.getEmail());
        emailDtO.setSubjecto("Cadastro realizado com sucesso");
        emailDtO.setText(userModel.getName() + ", seja bem vindo(a)! \n agradecemos o seu cadastro, aproveite agora todos os recursos da nossa plataforma");

        rabbitTemplate.convertAndSend("", routingKey, emailDtO);
    }
}
