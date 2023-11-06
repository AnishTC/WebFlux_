package com.tc.training.mapper;

import com.tc.training.dtos.inputdto.AccountDetailsInputDto;
import com.tc.training.dtos.outputdto.UserOutputDto;
import com.tc.training.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-04T13:20:33+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserOutputDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserOutputDto userOutputDto = new UserOutputDto();

        userOutputDto.setUserId( user.getId() );
        userOutputDto.setFirstName( user.getFirstName() );
        userOutputDto.setLastName( user.getLastName() );
        userOutputDto.setDob( user.getDob() );
        userOutputDto.setEmail( user.getEmail() );
        userOutputDto.setAge( user.getAge() );
        userOutputDto.setAadharCardNumber( user.getAadharCardNumber() );
        userOutputDto.setPanCardNumber( user.getPanCardNumber() );
        userOutputDto.setPhoneNumber( user.getPhoneNumber() );
        userOutputDto.setRoleName( user.getRoleName() );

        return userOutputDto;
    }

    @Override
    public User accountInputDtoToUser(AccountDetailsInputDto accountDetailsInputDto) {
        if ( accountDetailsInputDto == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( accountDetailsInputDto.getFirstName() );
        user.setLastName( accountDetailsInputDto.getLastName() );
        user.setDob( accountDetailsInputDto.getDob() );
        user.setEmail( accountDetailsInputDto.getEmail() );
        user.setAadharCardNumber( accountDetailsInputDto.getAadharCardNumber() );
        user.setPanCardNumber( accountDetailsInputDto.getPanCardNumber() );
        user.setPhoneNumber( accountDetailsInputDto.getPhoneNumber() );

        return user;
    }
}
