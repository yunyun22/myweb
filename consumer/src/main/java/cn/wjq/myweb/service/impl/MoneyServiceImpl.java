package cn.wjq.myweb.service.impl;

import cn.wjq.myweb.domain.SeataAccount;
import cn.wjq.myweb.mapper.SeataAccountMapper;
import cn.wjq.myweb.service.MoneyService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private SeataAccountMapper seataAccountMapper;

    @Override
    public void reduceMoney(int reduceMoney, int id) {
        SeataAccount seataAccount = seataAccountMapper.selectById(id);
        seataAccount.setMoney(seataAccount.getMoney() - 5000);
        seataAccountMapper.updateById(seataAccount);

    }
}
