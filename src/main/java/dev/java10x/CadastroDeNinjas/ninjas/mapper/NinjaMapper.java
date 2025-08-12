package dev.java10x.CadastroDeNinjas.ninjas.mapper;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {


    public NinjaModel map(NinjaDto ninjaDto) {
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDto.getId());
        ninjaModel.setName(ninjaDto.getName());
        ninjaModel.setEmail(ninjaDto.getEmail());
        ninjaModel.setAge(ninjaDto.getAge());
        ninjaModel.setRank(ninjaDto.getRank());
        ninjaModel.setImgUrl(ninjaDto.getImgUrl());
        ninjaModel.setMissoes(ninjaDto.getMissoes());
        return ninjaModel;
    }

    public NinjaDto map(NinjaModel ninjaModel){
        NinjaDto ninjaDto = new NinjaDto();
        ninjaDto.setId(ninjaModel.getId());
        ninjaDto.setName(ninjaModel.getName());
        ninjaDto.setEmail(ninjaModel.getEmail());
        ninjaDto.setAge(ninjaModel.getAge());
        ninjaDto.setRank(ninjaModel.getRank());
        ninjaDto.setImgUrl(ninjaModel.getImgUrl());
        ninjaDto.setMissoes(ninjaModel.getMissoes());
        return ninjaDto;
    }
}
