package ru.shopify.security.details;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.shopify.repositories.AccountsRepository;

@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final String ACCOUNT_NOT_FOUND_MSG = "Account with email <\" + email + \"> not found.";
    private final AccountsRepository accountsRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new UserDetailsImpl(accountsRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException(ACCOUNT_NOT_FOUND_MSG)));
    }
}
