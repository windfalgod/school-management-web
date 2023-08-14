package com.management.adqualtechschool.service;

import com.management.adqualtechschool.dto.AccountCreationDTO;
import com.management.adqualtechschool.dto.AccountDTO;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccountService {
    AccountCreationDTO getAccountCreationByUsername(String username);
    AccountDTO getAccountById(Long id);
    void deleteById(Long id);
    AccountDTO getAccountByUsername(String username);
    String changePassword(AccountCreationDTO account, String currentPassword, String newPassword);
    List<AccountDTO> getAllTeacherAccount();
    Page<AccountDTO> getListTeacherPaginated(Pageable pageable);
    Page<AccountDTO> filterTeacherPaginatedBySubjectName(Pageable pageable, String subjectName);
    Page<AccountDTO> searchTeachersPaginated(Pageable pageable, String search);
    void upgradeToManagerRole(Long id);
    AccountCreationDTO saveTeacher(AccountCreationDTO accountDTO);
    List<AccountDTO> getAllPupilAccount();
    Page<AccountDTO> getListPupilPaginated(Pageable pageable);
    Page<AccountDTO> filterPupilPaginated(Pageable pageable, String gradeName, String className);
    Page<AccountDTO> searchPupilPaginated(Pageable pageable, String search);
}
